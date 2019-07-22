(ns pto.core
  (:gen-class)
  (:require [java-time]))

(defn days
  [start-date now]
  (java-time/time-between
    start-date now :days))

(defn balance
  ([start-date now]
    (* 0.22
      (days start-date now)))

  ([start-date]
    (balance start-date (java-time/local-date)))

  ([]
    (balance (java-time/local-date) (java-time/local-date))))

(defn -main
  [& args]
  (println (balance) "hours"))
