// 第一引数の内容を読み込む
def lines = new File(args[0]).readLines()

// Markdown形式をHTMLに変換
def md = new Markdown()
def contents = lines.collect {
  md.headerAtx(it)
}.join('\n')

// 読み込んだ内容をHTMLのテンプレートに流し込む
println """<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<title>fumomarkdowng</title>
</head>
<body>
${contents}
</body>
</html>"""
