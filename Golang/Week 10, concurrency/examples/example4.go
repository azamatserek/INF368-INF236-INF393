package examples

import (
	"fmt"
)

func Fibonacci(n int, c chan int) {
	x, y := 0, 1
	for i := 0; i < n; i++ {
		c <- x
		x, y = y, x+y
	}
	close(c)
}

func Main4() {
	c := make(chan int, 10)
	go Fibonacci(cap(c), c)
	for i := range c {
		fmt.Println(i)
	}
}
