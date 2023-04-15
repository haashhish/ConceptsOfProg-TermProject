fun shuffle(line: String, indices:IntArray) : String
{
    val charactersArray = line.toCharArray()
    for(i in 0 until line.length)
    {
        charactersArray[indices[i].toInt()] = line[i]
    }
    var finalLine = String(charactersArray)
    return finalLine
}

fun main()
{
    var flag:Boolean = true
    println("Enter a string: ")
    var line = readLine()!!
    var size = line.length
    var indices = IntArray(size)
    for(i in 0 until size)
    {
      println("Enter index no."+(i+1)+": ")
      var value = readLine()?.toInt()
      if(value!! > (size-1))
      {
        println("Out of range")
        flag = false
        break
      }
      else{
        indices[i] = value!!
      }
    }
    if(flag)
    {
      println("The line before shuffling: "+line)
      line = shuffle(line, indices)
      println("The line after shuffling: "+line)
    }
}
