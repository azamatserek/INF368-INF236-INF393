package main

import (
  "net/http"

  "github.com/gin-gonic/gin"
)

func main() {
  r := gin.Default()
  r.GET("/resource", func(c *gin.Context) {
    c.JSON(http.StatusOK, gin.H{
      "data": "resource data",
    })
  })
  r.GET("/clients", func(c *gin.Context) {
    c.JSON(http.StatusOK, gin.H{
    "key":"value"})
  }
  r.Run() // Listen and serve on 0.0.0.0:8080 (for Windows "localhost:8080")
}