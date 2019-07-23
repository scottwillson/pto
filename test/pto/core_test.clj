(ns pto.core-test
  (:require [clojure.test :refer :all]
            [java-time]
            [pto.core :refer :all]))

(deftest main-test
  (testing "main"
    (is (=
         (with-out-str (-main))
         "0 hours\n") "default")
    (is (=
         (with-out-str (-main "2015-09-28" "2015-12-31"))
         "20 hours\n") "default")))

(deftest balance-test
  (testing "balance"
    (is (= (balance) 0) "default")
    (is (= (balance (java-time/local-date)) 0) "on start date")
    (is (= (balance
            (java-time/local-date 2019 1) (java-time/local-date 2019 2))
           6)
        "Jan 1 - Feb 1")))
