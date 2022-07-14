(ns service.main-test
  (:require [clojure.test :refer [deftest testing is]]
            [service.main :as sut]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest handler-test
  (testing "I pass but don't really test anything."
    (is (= "I totally handled that!"
           (sut/handler "I should be a request map.")))))
