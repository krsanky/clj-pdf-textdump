(ns myrec-pdf.core 
	(:gen-class)
	(:require [pdfboxing.text :as text]))

(def pdf-fn "9e9ed3_3dc0b7e52b1d4203b7d673dc95224db9.pdf")

(defn -main
	"I don't do a whole lot ... yet."
	[& args]
	(println (str "Hello, World!: " pdf-fn)))



;;(require '[pdfboxing.text :as text])
;;(text/extract "test/pdfs/hello.pdf")
