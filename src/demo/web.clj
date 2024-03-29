(ns demo.web
  (:use ring.adapter.jetty))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello from Clojure!\n"})

(defn -main []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (run-jetty app {:port port})))
