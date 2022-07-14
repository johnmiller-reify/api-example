(ns service.main
  (:require
   [compojure.core :refer [defroutes GET]]
   [compojure.route :as route]
   [ring.adapter.jetty :as jetty]
   [ring.util.http-response :as resp])
  (:gen-class))

(defn handler
  [request]
  "I totally handled that!")

(defroutes app
  (GET "/" [:as request]
   (resp/ok (handler request)))
  (route/not-found (resp/not-found)))

(defn -main
  "I am the ghost of services future."
  [& args]
  ;; The default port is 80. The options map is included to be informative.
  (jetty/run-jetty app {:port 8080}))
