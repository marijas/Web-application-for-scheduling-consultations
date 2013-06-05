(ns view.page
  (:use [hiccup.page :only (html5 include-css)]))

(defn layout
  [body message]
  (html5
    [:head
     [:meta {:charset "utf=8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
     [:meta {:name "template" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
     [:link {:rel "stylesheet" :type "text/css" :href "/css/style.css"}]
     [:title "Cheduling consultations"]
     (include-css "/css/style.css")]
    
    [:body
     [:div {:class "container"}
      [:div {:class "header"}
       [:h1 "Web application for cheduling consultations"]] 
      [:div {:class "menu"}]
      [:div {:class "leftmenu"}
       [:div {:class "leftmenu_main"} 
        [:ul 
         [:li [:a {:href "#"} "Registration"]]]]]
      [:div {:class "content"}
       [:div {:class "content_main"} body]]
      [:div {:class "footer"} 
       [:h3 [:a "by Marija Savić"]]]
      ]]    
 ))


(defn login-view
  [message]
  (layout
    (html5
      [:h2 "Log in"]
      [:form {:method "post" :action "/login"}
       [:p "Username:  " [:input {:type "text" :name "username"}]]
       [:p "Password:  " [:input {:type "password" :name "password"}]]
       [:input {:type "submit" :value "Log in"}][:br]]
)
    message))


