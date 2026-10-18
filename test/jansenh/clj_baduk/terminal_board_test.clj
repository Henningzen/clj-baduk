(ns jansenh.clj-baduk.terminal-board-test
  (:require [jansenh.clj-baduk.terminal-board :as sut]
            [jansenh.clj-baduk.utilities :as utils]
            [clojure.test :refer [deftest is testing]]
            [clojure.pprint :as pp]))

(comment
  (def nboard utils/numeric-board)
  (def board utils/patterned-board)

  (sut/symbolic-board utils/patterned-board)
  (println (sut/symbolic-board utils/patterned-board))
  
  ,
  )


