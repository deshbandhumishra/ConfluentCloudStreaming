package model

class RecordJSON() {
  private[model] var count = 1

  def this(shah:Int){
    this()
    this.count=shah
  }

  def getCount():Int={
    count
  }

}



/*
*  def this(count: Long) {
    this()
    this.count = count
  }

  def getCount: Long = count
*
* */