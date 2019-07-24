(ns pto.views
  (:require [clojure.string :as str]
            [hiccup.page :as page]))

(defn page-head
  [title]
  [:head
    [:title (str "PTO: " title)]
      (page/include-css "https://fonts.googleapis.com/icon?family=Material+Icons")
      (page/include-css "https://code.getmdl.io/1.3.0/material.indigo-pink.min.css")
      [:script {:defer true :src "https://code.getmdl.io/1.3.0/material.indigo-pink.js"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]])

(defn home-page
  []
  (page/html5
    {:class "mdl-js"}
    (page-head "Home")
    [:div {:class "mdl-layout mdl-js-layout"}
      [:header {:class "mdl-layout__header"}
        [:div {:class "mdl-layout-icon"}]]
      [:main {:class "mdl-layout__content"}
        [:div {:class "mdl-layout__tab-panel is-active"}
          [:section {:class "section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp"}
            [:div {:class "mdl-card mdl-cell mdl-cell--12-col"}
              [:div {:class "mdl-card__supporting-text"}
                [:h4 "PTO"]
                "Dolore ex deserunt aute fugiat"]]]]]]))
