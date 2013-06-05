(defproject consultation "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.2.2"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 [com.datomic/datomic-free "0.8.3861"]
                 [clojure-soup "0.0.1"]]
  :dev-dependencies [[lein-eclipse "1.0.0"]]
  :main consultation.core)

