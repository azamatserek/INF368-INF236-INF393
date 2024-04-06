package main

import (
"week11_go/logging"
      "net/http"

        "github.com/prometheus/client_golang/prometheus/promhttp"
)
func main(){
    logging.Execute_txt_log()
    //logging.Execute_panic()
    //logging.Execute()
    http.Handle("/metrics", promhttp.Handler())
    http.ListenAndServe(":2112", nil)
}