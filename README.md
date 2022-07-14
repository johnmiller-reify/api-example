# lein-exercise-template
A functional skeleton service.

##About
This provides a bare bones service using leiningen for project and
dependency management. The following dependencies are already used:
- [compojure](https://github.com/weavejester/compojure)
- [metosin/ring-http-response](https://github.com/metosin/ring-http-response)
- [org.clojure/clojure](https://github.com/clojure/clojure)
- [ring/ring-jetty-adapter](https://github.com/ring-clojure/ring)

The service comes with a single defined route at GET '/'.
The handler for this route accepts the request in its entirety
and returns a static string.

##Run
To run this: `lein run`

##Test
There are two tests predefined. One is the stock leiningen test provided
when a new leiningen project is built for you. It is failing. The other
is a passing test that actually refers to a namespace but just tests
the static string returned by the `handler` function.

To run all tests: `lein test`
