// 第一引数の内容を読み込む
def contents = new File(args[0]).text

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
