(ns myrec-pdf.core 
	(:gen-class)
	(:require [pdfboxing.text :as text]))

(def pdf-fn "9e9ed3_3dc0b7e52b1d4203b7d673dc95224db9.pdf")

(defn pdf1 []
	(print (text/extract pdf-fn))
	(println ""))

(defn -main [& args]
	(println (str "pdf: " pdf-fn))
	(pdf1)
	)

