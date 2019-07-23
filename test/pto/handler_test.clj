(ns pto.handler-test
  (:require [clojure.test :refer :all]
            [pto.handler :refer :all]
            [ring.mock.request :as mock]))

(deftest handler-test
  (let [{:keys [status headers]} (app (mock/request :get "/"))]
    (is (= status 200))
    (is (= (get headers "Content-Type") "text/html; charset=utf-8"))))
