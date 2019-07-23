(ns pto.views
  (:require [clojure.string :as str]
            [hiccup.page :as page]))

(defn page-head
  [title]
  [:head
   [:title (str "PTO: " title)]
   (page/include-css "https://fonts.googleapis.com/icon?family=Material+Icons")
   (page/include-css "https://code.getmdl.io/1.3.0/material.indigo-pink.min.css")
   [:script :defer {:src "https://code.getmdl.io/1.3.0/material.min.js"}]])

(defn home-page
  []
  (page/html5
   (page-head "Home")
   [:h1 "Home"]
   [:p "No PTO for you"]))
