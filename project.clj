(defproject pto "0.1.0-SNAPSHOT"
            :description "Simple exercise to calculate PTO"
            :url "http://example.com/FIXME"
            :license {:name "The MIT License"
                      :url "http://opensource.org/licenses/MIT"}
            :dependencies [[clojure.java-time "0.3.2"]
                           [compojure "1.6.1"]
                           [hiccup "1.0.5"]
                           [ring/ring-defaults "0.3.2"]
                           [org.clojure/clojure "1.10.0"]]
            :main ^:skip-aot pto.core
            :plugins [[lein-ring "0.12.5"]]
            :ring {:handler pto.handler/app}
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}
                       :dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                            [ring/ring-mock "0.4.0"]]}})
