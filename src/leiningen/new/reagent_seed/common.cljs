(ns {{ns-name}}.views.common
  (:require  [{{ns-name}}.session :as session]))

(defn active? [state val]
  (if (= (state) val) "active" ""))

(defn header []
  [:div.page-header {:class-name "row"}
   ;; 4 column units
  [:div#title {:class-name "col-md-4"} "{{name}}"]
   ;; 8 column units
   [:div {:class-name "col-md-8"}
    [:ul.nav.nav-pills 
     [:li {:class (active? session/nav "home")}  [:a {:href "#/"} [:span {:class-name "fa fa-home"} " Home"]]]
     [:li {:class (active? session/nav "about")} [:a {:href "#/about"} "About"]]
     ]]])

(defn footer []
  [:div
   [:div.page-header]
   [:footer {:class-name "site-footer"}
    ;; UPDATE ME
    [:span {:class-name "fa fa-twitter"}] " @FIXME | " [:span {:class-name "fa fa-github"}] " FIXME | " [:span {:class-name "fa fa-envelope-o"}] " FIXME@gmail.com"]
   ])
