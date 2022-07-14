(defproject service "0.1.0-SNAPSHOT"
  :dependencies [[compojure "1.6.3"]
                 [metosin/ring-http-response "0.9.3"]
                 [org.clojure/clojure "1.11.1"]
                 [ring/ring-jetty-adapter "1.9.5"]]
  :main ^:skip-aot service.main
  :target-path "target/%s")
