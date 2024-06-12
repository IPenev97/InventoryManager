package com.example.inventorymanager.data;

import android.content.Context;

import com.example.inventorymanager.data.entities.BookEntity;
import com.example.inventorymanager.data.entities.DetailsEntity;
import com.example.inventorymanager.data.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PresetDataHelper {
    private Context context;
    private BookRepository bookRepository;
    public static boolean dataIsPreset = false;

    public PresetDataHelper(Context context) {
        this.context = context;
        bookRepository = new BookRepository(context);
    }

    public void presetBooks() {
        if (!dataIsPreset) {
            List<BookEntity> bookList = new ArrayList<>();
            DetailsEntity origind = new DetailsEntity("“Origin” is a gripping science thriller novel written by Dan Brown, the celebrated author known for his Robert Langdon series, which includes bestsellers like “The Da Vinci Code” and “Angels & Demons.” Published in 2017, “Origin” explores the intersection of science, religion, and technology while taking readers on a thrilling journey through Barcelona, Spain's beautiful and historic city.", "October 3, 2017", "Thriller");
            DetailsEntity davincid = new DetailsEntity("The Da Vinci Code is a 2003 mystery thriller novel by Dan Brown. It is Brown's second novel to include the character Robert Langdon: the first was his 2000 novel Angels & Demons. The Da Vinci Code follows symbologist Langdon and cryptologist Sophie Neveu after a murder in the Louvre Museum in Paris entangles them in a dispute between the Priory of Sion and Opus Dei over the possibility of Jesus and Mary Magdalene having had a child together.", "March 18, 2003", "Thriller");
            DetailsEntity digitald = new DetailsEntity("Digital Fortress is a techno-thriller novel written by American author Dan Brown and published in 1998 by St. Martin's Press. The book explores the theme of government surveillance of electronically stored information on the private lives of citizens, and the possible civil liberties and ethical implications of using such technology.", "1998", "Thriller");
            DetailsEntity lostsymbold = new DetailsEntity("The Lost Symbol is a 2009 novel written by American writer Dan Brown.[2][3] It is a thriller set in Washington, D.C., after the events of The Da Vinci Code, and relies on Freemasonry for both its recurring theme and its major characters.[4]\n" +
                    "\n" +
                    "Released on September 15, 2009, it is the third Brown novel to involve the character of Harvard University symbologist Robert Langdon, following 2000's Angels & Demons and 2003's The Da Vinci Code.[2] It had a first printing of 6.5 million (5 million in North America, 1.5 million in the UK), the largest in Doubleday history. On its first day the book sold one million in hardcover and e-book versions in the U.S., the UK and Canada, making it the fastest selling adult novel in history.[5] It was number one on the New York Times Best Seller list for hardcover fiction[6] for the first six weeks of its release,[7] and remained on the list for 29 weeks. As of January 2013, there were 30 million copies in print worldwide.[8]", "September 15, 2009", "Thriller");
            DetailsEntity infernod = new DetailsEntity("Inferno is a 2013 mystery thriller novel by American author Dan Brown and the fourth book in his Robert Langdon series, following Angels & Demons, The Da Vinci Code and The Lost Symbol. The book was published on May 14, 2013, ten years after publication of The Da Vinci Code (2003), by Doubleday.[1] It was number one on the New York Times Best Seller list for hardcover fiction and Combined Print & E-book fiction for the first eleven weeks of its release, and also remained on the list of E-book fiction for the first seventeen weeks of its release. A film adaptation was released in the United States on October 28, 2016.", "May 14, 2013", "Thriller");
            DetailsEntity angelsD = new DetailsEntity("Angels & Demons is a 2000 bestselling mystery-thriller novel written by American author Dan Brown and published by Pocket Books and then by Corgi Books. The novel introduces the character Robert Langdon, who recurs as the protagonist of Brown's subsequent novels. Angels & Demons shares many stylistic literary elements with its sequels, such as conspiracies of secret societies, a single-day time frame, and the Catholic Church. Ancient history, architecture, and symbology are also heavily referenced throughout the book. A film adaptation was released on May 15, 2009.", "May 2000", "Thriller");
            DetailsEntity itd = new DetailsEntity("It is a 1986 horror novel by American author Stephen King. It was his 22nd book and the 17th novel written under his own name. The story follows the experiences of seven children as they are terrorized by an evil entity that exploits the fears of its victims to disguise itself while hunting its prey. \"It\" primarily appears in the form of Pennywise the Dancing Clown to attract its preferred prey of young children.\n" +
                    "\n" +
                    "The novel is told through narratives alternating between two periods and is largely told in the third-person omniscient mode. It deals with themes that eventually became King staples: the power of memory, childhood trauma and its recurrent echoes in adulthood, the malevolence lurking beneath the idyllic façade of the American small town, and overcoming evil through mutual trust and sacrifice.", "September 15, 1986", "Horror");
            DetailsEntity theshiningd = new DetailsEntity("The Shining is a 1977 horror novel by American author Stephen King. It is King's third published novel and first hardcover bestseller; its success firmly established King as a preeminent author in the horror genre. The setting and characters are influenced by King's personal experiences, including both his visit to The Stanley Hotel in 1974 and his struggle with alcoholism. The novel was adapted into a 1980 film and a 1997 miniseries. The book was followed by a sequel, Doctor Sleep, published in 2013, which in turn was adapted into a film of the same name in 2019.\n" +
                    "\n" +
                    "The Shining centers on Jack Torrance, a struggling writer and recovering alcoholic who accepts a position as the off-season caretaker of the historic Overlook Hotel in the Colorado Rockies. His family accompanies him on this job, including his young son Danny, who possesses \"the shining\", an array of psychic abilities that allow the child to glimpse the hotel's horrific true nature. Soon, after a winter storm leaves the family snowbound, the supernatural forces inhabiting the hotel influence Jack's sanity, leaving his wife and son in grave danger.", "January 28, 1977", "Horror");
            DetailsEntity carried = new DetailsEntity("Carrie is a 1974 horror novel, the first by American author Stephen King. Set in Chamberlain, Maine, the plot revolves around Carrie White, a friendless, bullied high-school girl from an abusive religious household who discovers she has telekinetic powers. Remorseful for picking on Carrie, Sue Snell insists that she go to prom with Sue's boyfriend Tommy Ross, though a revenge prank pulled by one of Carrie's bullies on prom night humiliates Carrie, leading her to destroy the town with her powers out of revenge. An epistolary novel, Carrie deals with themes of ostracization and revenge, with the opening shower scene and the destruction of Chamberlain being pivotal scenes.", "April 5, 1974", "Horror");
            DetailsEntity petsemetaryd = new DetailsEntity("Louis Creed, a doctor from Chicago, is appointed director of the University of Maine's campus health service. He moves to a house near the town of Ludlow with his wife Rachel, their two young children, Ellie and Gage, and Ellie's cat, Winston Churchill (\"Church\"). Their elderly neighbor, Jud Crandall, warns Louis and Rachel about the highway that runs past their house, which is frequented by speeding trucks.\n" +
                    "\n" +
                    "Jud and Louis become close friends, with Louis viewing Jud as a surrogate father. Jud takes the family on a walk in the woods behind their home. A well-tended path leads to a pet cemetery (misspelled \"sematary\" on the sign), where the children of the town bury their deceased animals.", "November 4, 1983", "asdasf");
            DetailsEntity greenmile = new DetailsEntity("The Green Mile is a 1996 serial novel by American writer Stephen King. It tells the story of death row supervisor Paul Edgecombe's encounter with John Coffey, an unusual inmate who displays inexplicable healing and empathetic abilities. The serial novel was originally released in six volumes before being republished as a single-volume work. The book is an example of magical realism. The subsequent film adaptation was a critical and commercial success. The Green Mile won the Bram Stoker Award for Best Novel in 1996.[1] In 1997, The Green Mile was nominated as Best Novel for the British Fantasy Award and the Locus Award.[2] In 2003 the book was listed on the BBC's The Big Read poll of the UK's \"best-loved novel\".[3]", "March–August 1996", "Horror");
            bookList.add(new BookEntity("Origin", 1, "https://upload.wikimedia.org/wikipedia/en/thumb/6/67/Origin_%28Dan_Brown_novel_cover%29.jpg/220px-Origin_%28Dan_Brown_novel_cover%29.jpg", "Dan Brown"));
            bookList.add(new BookEntity("The Da Vinci Code", 2, "https://m.media-amazon.com/images/I/815WORuYMML._AC_UF1000,1000_QL80_.jpg", "Dan Brown"));
            bookList.add(new BookEntity("Digital Fortress", 3, "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1360095966i/11125.jpg", "Dan Brown"));
            bookList.add(new BookEntity("The Lost Symbol", 4, "https://upload.wikimedia.org/wikipedia/en/0/07/LostSymbol.jpg", "Dan Brown"));
            bookList.add(new BookEntity("Inferno", 5, "https://m.media-amazon.com/images/I/915Qc30l2aL._AC_UF1000,1000_QL80_.jpg", "Dan Brown"));
            bookList.add(new BookEntity("Angels And Demons", 6, "https://m.media-amazon.com/images/I/81S+VsvKTlL._AC_UF1000,1000_QL80_.jpg", "Dan Brown"));
            bookList.add(new BookEntity("It", 7, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/It_%281986%29_front_cover%2C_first_edition.jpg/220px-It_%281986%29_front_cover%2C_first_edition.jpg", "Stephen King"));
            bookList.add(new BookEntity("The Shining", 8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWxO0q2pYOkncnKotD4oNpO-UpUluSOQuF-dhxukNXS-HNLQR7_eKGWBeK&s=5", "Stephen King"));
            bookList.add(new BookEntity("Carrie", 9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1LXF2li1L_3fT0EUgtUZb-sR1r8YgRNql2-j849nlCgR3R_Vm1Vc-cvwL&s=5", "Stephen King"));
            bookList.add(new BookEntity("Pet Semetary", 10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgY8xHAEOzbfuDBPMG8H-OnSDODYqcZg4v3SW8B-ftu5n5IzaTf4W_QUjI&s=5", "Stephen King"));
            bookList.add(new BookEntity("The Green Mile", 11, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4opdjJTsePVlmCU_8xTyjdqy94MuYSNujgoehGvKAoNuuZft1ex7AzTaI&s=5", "Stephen King"));
            dataIsPreset = true;
            try {
                List<DetailsEntity> details = new ArrayList<>();
                details.add(origind);
                details.add(davincid);
                details.add(digitald);
                details.add(lostsymbold);
                details.add(infernod);
                details.add(angelsD);
                details.add(itd);
                details.add(theshiningd);
                details.add(carried);
                details.add(petsemetaryd);
                details.add(greenmile);
                bookRepository.insertDetails(details);
                bookRepository.insertBooks(bookList);


            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

