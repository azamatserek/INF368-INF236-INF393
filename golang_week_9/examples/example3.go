package examples

import "fmt"

func Main3() {
	ch := make(chan int, 3)
	ch <- 1
	ch <- 2
	fmt.Println(<-ch)
	fmt.Println(<-ch)
}
