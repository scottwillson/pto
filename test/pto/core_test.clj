(ns pto.core-test
  (:require [clojure.test :refer :all]
            [java-time]
            [pto.core :refer :all]))


(deftest main-test
  (testing "main"
    (is (=
      (with-out-str (-main))
       "0\n"))))

(deftest balance-test
  (testing "balance"
    (is (= (balance) 0))
    (is (= (balance (java-time/local-date)) 0))))
