def file = new File(System.getProperty('user.dir') + "\\json.txt")
// 遍历输出每一行
file.eachLine {
    line -> println line
}
println file.text
println file.readLines()
println file.withReader {
    reader ->
        println reader.readLines()
}

println copyFile(System.getProperty("user.dir") + "\\json.txt", System.getProperty("user.dir") + "\\copy file.txt")

boolean copyFile(String sourcePath, String destinationPath) {
    def destinationFile = new File(destinationPath)
    if (!destinationFile.exists()) {
        destinationFile.createNewFile()
    }
    new File(sourcePath).withReader {
        reader ->
            def lines = reader.readLines()
            destinationFile.withWriter {
                writer ->
                    lines.each { line -> writer.append(line + "\r\n") }
            }
    }
    true
}