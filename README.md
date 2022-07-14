# lein-exercise-template
A functional skeleton service.

This provides a bare bones service using leiningen for project and
dependency management. The following dependencies are already used:
- [compojure](https://github.com/weavejester/compojure)
- [metosin/ring-http-response](https://github.com/metosin/ring-http-response)
- [org.clojure/clojure](https://github.com/clojure/clojure)
- [ring/ring-jetty-adapter](https://github.com/ring-clojure/ring)

The service comes with a single defined route at GET '/'.
The handler for this route accepts the request in its entirety
and returns a static string.

To run this: `lein run`
