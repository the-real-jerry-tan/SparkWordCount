/**
 * © 2024 Jerry Tan. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Jerry Tan
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms under which this software
 * was distributed or otherwise published, and solely for the prior express purposes
 * explicitly communicated and agreed upon, and only for those specific permissible purposes.
 *
 * This software is provided "AS IS," without a warranty of any kind. All express or implied
 * conditions, representations, and warranties, including any implied warranty of merchantability,
 * fitness for a particular purpose, or non-infringement, are disclaimed, except to the extent
 * that such disclaimers are held to be legally invalid.
 *
 * This is the main source file for the Spark Word Count project.
 */

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;

import java.util.Arrays;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        // Set up Spark configuration and create a context
        SparkConf conf = new SparkConf().setAppName("WordCountApp").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        // Read input file
        JavaRDD<String> input = sc.textFile("input.txt");

        // Split into words, map to pairs (word, 1), and reduce by key
        JavaRDD<String> words = input.flatMap(line -> Arrays.asList(line.split(" ")).iterator());
        Map<String, Long> wordCounts = words.countByValue();

        // Print out the word counts
        wordCounts.forEach((word, count) -> System.out.println(word + " : " + count));

        // Stop the Spark context
        sc.stop();
    }
}
