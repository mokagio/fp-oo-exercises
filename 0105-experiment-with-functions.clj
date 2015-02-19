;; take
;; Given a _previously generated_ sequence of random players IDs, take the first 3 as the winners
(def winners (fn [coll] (take 3 coll)))

;; distinct
;; Remove duplicated entries from list of partecipants IDS
(def you_cant_submit_twice (fn [coll] (distinct coll)))

;; concat
;; Merge the list of winners from group A B and C, to prepare the list for the next stage of the tournament
(def merge_winners (fn [a b c] (concat a b c)))

;; repeat

;; interleave

;; drop
;; drop-last
(def winners_and_loosers (fn [coll] [ (drop-last 3 coll) (drop 3 coll) ]))

;; flatten
