(ns pto.core-test
  (:require [clojure.test :refer :all]
            [pto.core :refer :all]))

(deftest main
  (testing "main"
    (is (=
      (with-out-str (-main))
       "0\n"))))
