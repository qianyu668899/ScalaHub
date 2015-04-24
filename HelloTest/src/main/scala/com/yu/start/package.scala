package com.yu

/**
 * Created by Yu on 15-04-24.
 */

import com.mongodb.casbah.Imports._

package object start {
  def main(args: Array[String]) {
    println("Hello, My world!")
    val mongoClient = MongoClient("localhost", 27017)
    val db = mongoClient("test")
    db.collectionNames
    val coll = db("test")
    val a = MongoDBObject("hello" -> "world")
    val b = MongoDBObject("language" -> "scala")
    coll.insert( a )
    coll.insert( b )
  }
}
