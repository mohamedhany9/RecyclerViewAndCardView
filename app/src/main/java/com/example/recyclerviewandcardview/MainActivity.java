package com.example.recyclerviewandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BooKDetails();

        RecyclerView mRecyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,listBook);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(adapter);
    }

    private void BooKDetails() {
        listBook = new ArrayList<>();
        listBook.add(new Book("mohamed","categoryBook","Information theory studies the quantification, storage, and communication\n" +
                "of information. It was originally proposed by Claude E. Shannon in 1948 to\n" +
                "find fundamental limits on signal processing and communication operations\n" +
                "such as data compression, in a landmark paper entitled \"A Mathematical\n" +
                "Theory of Communication\". Now this theory has found applications in many\n" +
                "other areas, including statistical inference, natural language processing,\n" +
                "cryptography, neurobiology, the evolution and function of molecular codes,\n" +
                "model selection in ecology, thermal physics, quantum computing,\n" +
                "linguistics, plagiarism detection, pattern recognition, and anomaly\n" +
                "detection",R.drawable.book1));
        listBook.add(new Book("code","Code Book","The field is at the intersection of mathematics, statistics, computer science,\n" +
                "physics, neurobiology, and electrical engineering. Important sub-fields of\n" +
                "information theory include source coding, channel coding, algorithmic\n" +
                "complexity theory, algorithmic information theory, information-theoretic\n" +
                "security, and measures of information.",R.drawable.code));
        listBook.add(new Book("Eat","Eat Book","A key measure in information theory is \"entropy\". Entropy quantifies the\n" +
                "amount of uncertainty involved in the value of a random variable or the\n" +
                "outcome of a random process. For example, identifying the outcome of a\n" +
                "fair coin flip (with two equally likely outcomes) provides less information\n" +
                "(lower entropy) than specifying the outcome from a roll of a die (with six\n" +
                "equally likely outcomes). Some other important measures in information\n" +
                "theory are mutual information, channel capacity, error exponents, and\n" +
                "relative entropy.",R.drawable.eat));
        listBook.add(new Book("Sleep","Sleep Book","a noisy channel, this abstract concept was made concrete in 1948 by Claude Shannon in his paper \"A Mathematical Theory of Communication\", in which \"information\" is thought of as a set of possible messages, where the goal is to send these messages over a noisy channel, and then to have the receiver reconstruct the message with low probability of error, in spite of the channel noise. Shannon's main result, the noisy-channel coding theorem showed that, in the limit of many channel uses, the rate of information that is asymptotically achievable is equal to the channel capacity, a quantity dependent merely on the statistics of the channel over which the messages are sent.",R.drawable.sleep));

        listBook.add(new Book("mohamed","categoryBook","DescriptionBook",R.drawable.book1));
        listBook.add(new Book("code","Code Book","Description code Book",R.drawable.code));
        listBook.add(new Book("Eat","Eat Book","DescriptionBook",R.drawable.eat));
        listBook.add(new Book("Sleep","Sleep Book","DescriptionBook",R.drawable.sleep));

    }

}
