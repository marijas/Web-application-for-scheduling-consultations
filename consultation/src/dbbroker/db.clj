(ns dbbroker.db
  (:require [clojure.java.jdbc :as jdbc])
  (:use [clojure.contrib.sql :as sql]))

(def conn {:classname "com.mysql.jdbc.Driver"
            :subprotocol "mysql"
            :subname "//127.0.0.1:3306/consultation"
            :database "consultation"
            :user "root"
            :password ""})

(defn fetch-results [query]
     (jdbc/with-connection conn
       (jdbc/with-query-results res query
         (doall res))))

(defn login
     [user pass]
     (fetch-results [(str "SELECT * FROM user WHERE username = "user" and password = "pass)]
                    (not (empty? u))))
