(defproject four-clojure "0.1.0-SNAPSHOT"
  :description "Solutions to the very cool problems in www.4clojure.com"
  :url "https://github.com/webdude21/4clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot four-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
