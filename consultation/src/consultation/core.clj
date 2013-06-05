(ns consultation.core
  (:use [compojure.core :only (defroutes)]
        [ring.adapter.jetty :as ring])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.middleware.session :as session]
            [view.viewcontroller :as con]))


(defroutes routes
  con/routes
  (route/resources "/")
  (route/not-found "Page not found!"))

(def application (-> (handler/site routes) session/wrap-session))

(defn start [port]
  (run-jetty application {:port port :join? false}))

(defn -main []
  (let [port (Integer/parseInt
               (or (System/getenv "PORT") "8080"))]
    (start port)))
















