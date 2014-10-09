(defproject org.clojars.leanpixel/om-material "0.1.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2280"]
                 [org.clojars.leanpixel/om-fields "0.1.0-SNAPSHOT"]]

  :plugins [[jamesnvc/lein-lesscss "1.3.4"]]

  :source-paths ["src/clj" "src/cljs"]
  :lesscss-paths ["resources/less"]

  :lesscss-output-path "resources/public/css"

  :profiles {:dev {:plugins [[lein-cljsbuild "1.0.3"]]
                   :cljsbuild {:builds [{:id "om-material"
                                         :source-paths ["src/cljs"]
                                         :compiler {:output-to "resources/public/js/out/om-material.js"
                                                    :output-dir "resources/public/js/out"
                                                    :optimizations :none
                                                    :source-map true}}]}}}

  )
