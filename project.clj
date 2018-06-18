(defproject jesture "0.1.0-SNAPSHOT"
  :description "Experimental visualization of clojure.spec."
  :url "https://github.com/sgepigon/jesture"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot jesture.core
  :target-path "target/%s"
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[expound "0.7.0"]
                                  [org.clojure/test.check "0.9.0"]]}
             :uberjar {:aot :all}})
