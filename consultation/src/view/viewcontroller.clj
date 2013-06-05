(ns view.viewcontroller
  (:use [compojure.core :only (defroutes GET POST)]
        [ring.util.response])
  (:require [compojure.route :as route]
            [view.page :as view]))



(defn index
  "Login page"
  [message]
  (view/login-view message))


(defroutes routes
  (GET  "/" [] (index ""))
  )
