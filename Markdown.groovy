class Markdown {
  /** 見出し：Atx形式 */
  String headerAtx(String md) {
    def sharpSize = md.find(/^#+/).size()
    if (sharpSize in 1..6) {
      def tags = [  "<h${sharpSize}>",
                   "</h${sharpSize}>" ]
      //def contents = md.replaceAll(/^#+\s*|\s*#+$/, '').trim()
      def contents = md.replaceAll(/(?x) # enable whitespace and comments
        ^\#+   # 先頭からはじまるシャープ
        |      #   または
        \#+$   # 最後のシャープ
        /, '').trim()
      return "${tags.first()}${contents}${tags.last()}"
    } else {
      return md 
    }
  }
}
