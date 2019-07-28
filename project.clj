(defproject org.clojars.alai/stylefy-fork "1.13.3"
  :description "Library for styling UI components - forked from Jarzka/stylefy"
  :url "https://github.com/ALai57/stylefy"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [prismatic/dommy "1.1.0"]
                 [reagent "0.7.0"]
                 [garden "1.3.9"]
                 [org.clojure/core.async "0.3.443"]
                 ]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.7"]
            [lein-codox "0.10.6"]
            [lein-figwheel "0.5.18"]]
  :profiles {:dev {:dependencies [[clj-chrome-devtools "20180310"]
                                  [figwheel-sidecar "0.5.18"]]}}
  :codox {:language :clojurescript
          :output-path "doc"
          :source-paths ["src"]}
  :cljsbuild {:builds [{:id "test"
                        :source-paths ["src" "test"]
                        :compiler {:output-to "target/cljs/test/test.js"
                                   :output-dir "resources/public/js/compiled/out_dev"
                                   :optimizations :whitespace
                                   :pretty-print true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {:output-to "stylefy.js"
                                   :output-dir "resources/public/js/compiled/out_prod"
                                   :optimizations :advanced}}]})
