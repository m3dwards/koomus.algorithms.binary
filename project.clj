(def feature-version "0.1")
(def build-version (or (System/getenv "SNAP_PIPELINE_COUNTER") "HANDBUILT"))
(def release-version (str feature-version "." build-version "-SNAPSHOT"))

(defproject koomus.algorithms.binary release-version
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.3" ]]
                   :dependencies [[midje "1.6.3"]]}} 
)
