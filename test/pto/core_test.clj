(ns pto.core-test
  (:require [clojure.test :refer :all]
            [pto.core :refer :all]))

(deftest main-test
  (testing "main"
    (is (=
      (with-out-str (-main))
       "0\n"))))

(deftest balance-test
  (testing "balance"
    (is (= (balance) 0))))
