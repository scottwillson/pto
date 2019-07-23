(ns pto.core
  (:gen-class)
  (:require [java-time]))

(defn days
  [start-date now]
  (java-time/time-between
   start-date now :days))

(defn balance
  ([start-date now]
   (int
    (Math/floor
     (* 0.22
        (days start-date now)))))

  ([start-date]
   (balance start-date (java-time/local-date)))

  ([]
   (balance (java-time/local-date) (java-time/local-date))))

(defn parse-date-string
  [string]
  (java-time/local-date "yyyy-MM-dd", string))

(defn -main
  [& args]
   (println
     (apply balance (map parse-date-string args))
      "hours"))
