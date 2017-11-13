import scala.io.Source
import scala.util.control.Exception

class WordManager() {
  def Manager(): Unit = {
    val filename = "input.txt"

    //parsing through file and using a space to detect different words
    val words = Source.fromFile(filename).getLines.mkString.split(" ")

    //print
    for (row <- Source.fromFile(filename).getLines) {
      println(row)
    }
    println()
  }
}

class Counter() {
  def Count(): Unit = {
    var wordX = 0	//word
    var wordY = 0	//next word
    var wordCount = 0	//total number of words

    val filename = "input.txt"
    val words = Source.fromFile(filename).getLines.mkString.split(" ")
    val wordCheck = Source.fromFile(filename).getLines.mkString.split(" ")

    for (wordX <-  0 to (words.length - 1)) {
      for (wordY <- 0 to (wordCheck.length - 1)) {
        //Checking for 2 words to match, if they do the count will increment
        if (words(wordX) == wordCheck(y)) {
          wordCount = wordCount + 1
          wordCheck(wordY) = " "
        }
      }
      // print matches
      if (wordCount != 0) {
        println(words(wordX) + ": " + wordCount)
        wordCount = 0
      }
    }
  }
}

object UploadAssignment {

  def main(args : Array[String]) = {
	//creating instances of classes
    val wm = new WordManager()
    val cr = new Counter()
	//final output of program
    println("********************")
    wm.Manager()
    println("Total words in file: ")
    cr.Count()
  }
}
