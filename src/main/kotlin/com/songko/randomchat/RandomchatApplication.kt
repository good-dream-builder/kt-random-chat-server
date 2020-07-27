package com.songko.randomchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RandomchatApplication

fun main(args: Array<String>) {
	runApplication<RandomchatApplication>(*args)
}
