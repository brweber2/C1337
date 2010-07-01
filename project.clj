(defproject c1337 "1.0.0-SNAPSHOT"
  :description "c1337 'cleat' clojure library"
  :url "http://github.com/brweber2/c1337"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]]
  :repositories { "maven central" "http://repo1.maven.org/maven2"
                  "clojure releases" "http://build.clojure.org/releases" 
                  "clojure snapshots" "http://build.clojure.org/snapshots"
                  "clojars" "http://clojars.org/repo/" }
  :dev-dependencies [[lein-clojars "0.5.0"]]
  :main c1337.core.main )


