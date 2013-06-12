(ns view.viewcontroller
  (:use [compojure.core :only (defroutes GET POST)]
        [ring.util.response])
  (:require [compojure.route :as route]
            [view.page :as view]
            [dbbroker.db :as db]))



(defn index
  [message]
  (view/login message))

(defn log-in
  [params]
  (if (empty? params)
    (index "")    
    (if (= "" (:username params) (:password params))
      (index "Enter your username and password.")    
      (if (db/login (:username params) (:password params))
          (assoc (redirect "/home") :session {:user (:username params)})
        (index "Invalid username and/or password!")))))

(defn home
  [message]
  (view/home message))




(defroutes routes
  (GET  "/" [] (index ""))
  (POST "/login" {params :params}  (log-in params))
  (GET "/home" {session :session} (home session))

  )
