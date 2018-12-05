package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass
import java.util.*

class DSLTest( p :(Any) -> Unit) : TestClass(p){
    override fun doTest() {

        // 일반적인 방법
        val p0 = Player()
        p0.name   = "Player 0"
        p0.status = Status()
        p0!!.status!!.job   = "Wizard"
        p0!!.status!!.level = 20
        println (p0)

        // 제일 간단함
        val p1 = Player("Player 1", Status("Archer", 23))
        println(p1)

        // DSL이 편리할 수도 있다.
        val p2 = MakePlayer {
            name = "Player 2 - " + Random().nextInt(200).toString()
            status {
                job = "Paladin"
                level = Random().nextInt(70)
            }
        }

        println (p2)

    }

    fun MakePlayer(block: Player.() -> Unit): Player = Player().apply(block)
    fun Player.status(block : Status.()-> Unit){
        status = Status().apply(block)
    }
    // data class
    data class Player(var name: String? = null,
                      var status: Status? = null)
    data class Status(var job: String? = null, var level: Int? = null)
}