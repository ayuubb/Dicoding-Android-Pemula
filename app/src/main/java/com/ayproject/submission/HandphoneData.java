package com.ayproject.submission;

import java.util.ArrayList;

public class HandphoneData {
    private static  String[] hpNames ={
            "Poco F2 Pro",
            "Samsung Galaxy Note 20 Ultra",
            "Redmi 9",
            "vivo X50 Pro",
            "OPPO Reno4",
            "Redmi 9A",
            "Realme C15",
            "ASUS ROG Phone 3",
            "Samsung Galaxy Z Fold2",
            "Huawei Nova 7"
    };

    private static String[] hpDetails = {
            "Salah satu HP Xiaomi yang paling ngetren saat ini adalah Poco F2 Pro. Ini adalah seri lanjutan dari Pocophone F1 yang sempat menjadi bahan perbincangan orang-orang karena value-nya yang tinggi walau dibanderol dengan harga yang tidak begitu mahal.\n" +
                    "\n" +
                    "Di tahun 2020, kembali hadir Poco F2 Pro yang sama-sama menawarkan spesifikasi unggul, bahkan menyaingi ponsel-ponsel lain dengan harga lebih mahal. Bagaimana tidak? Ponsel ini sudah hadir dengan Snapdragon 865, padahal umumnya chipset powerful ini hanya ditemukan pada ponsel 10 jutaan.\n" +
                    "\n" +
                    "Selain itu juga, Poco F2 Pro hadir dengan kamera selfie tersembunyi yang hanya muncul saat akan digunakan. Ini sungguh penawaran yang menarik, karena pengguna pun bisa menonton film dan bermain game dengan layar yang penuh.",
            "Selain Samsung Galaxy S20 series yang telah hadir duluan, kini giliran series Note20 untuk menunjukkan taringnya. Ketimbang seri Galaxy S20, seri Note ini memang lebih diperuntukkan untuk produktivitas yang fleksibel.\n" +
                    "\n" +
                    "Untuk mendapatkan pengalaman terbaik, Anda direkomendasikan untuk memilih varian Ultranya. Sebab, perangkat ini memiliki stylus dengan kinerja yang lebih baik, juga lebih nyaman digunakan berkat layarnya yang lebih lebar.\n" +
                    "\n" +
                    "Anda bisa mencatat seolah menggunakan pulpen biasa, mengubah tulisan tangan menjadi teks, menambahkan anotasi pada tangkapan layar, dan masih banyak lagi sejumlah fitur menarik lainnya.\n" +
                    "\n" +
                    "Kekuatan ponsel ini juga terletak pada Samsung Wireless DeX, yakni kemampuan menjadikan HP sebagai desktop dengan cara menghubungkannya dengan monitor atau Smart TV.\n" +
                    "\n" +
                    "Adapun kamera utamanya yang menghadirkan resolusi super besar, yakni 108 MP. Menggunakan kombinasi quad camera, Samsung Galaxy Note20 Ultra juga kaya akan inovasi menarik seperti Single Take untuk menghadirkan foto ala-ala studio, perekaman video yang bisa menyesuaikan mic berdasarkan arah suara, dan masih banyak lagi.",
            "Ponsel dengan harga terjangkau memang banyak, tapi cukup jarang yang menghadirkan value tinggi seperti seri Redmi. Kini di tahun 2020 telah lahir generasi selanjutnya yakni Redmi 9. Ponsel ini banyak dibicarakan karena harganya yang hanya berkisar Rp1-jutaan tapi sudah menghadirkan fitur unggulan selayaknya ponsel mahal.\n" +
                    "\n" +
                    "Contohnya saja, Redmi 9 dihadirkan dengan chipset Helio G80 yang performanya sulit disaingi di kelasnya. Juga, quad camera yang dibawakannya sungguh mampu menghasilkan foto dengan kualitas ketajaman yang layak.\n" +
                    "\n" +
                    "Anda pun bisa berpuas diri bermain game lama-lama tanpa takut cepat habis baterai, karena memiliki kapasitas 5.000 mAh yang bisa dicas menggunakan fast charging 18 W (casan terpisah). Pokoknya kalau mau HP murah tapi berkualitas, Redmi 9 salah satu yang layak untuk dipilih.",
            "Ini dia ponsel pertama di dunia yang menghadirkan inovasi gimbal, yakni vivo X50 Pro. Berbeda dengan HP kebanyakan yang hanya memiliki EIS atau OIS biasa, perangkat ini lebih mampu menjaga kestabilan foto dan juga video agar hasilnya tidak ngeblur akibat tangan pengguna yang gemetar.\n" +
                    "\n" + "Nah, keberadaan gimbal ini pun sangat berguna apabila Anda harus memotret suatu objek dari jarak yang jauh. Karena walau di-zoom, vivo X50 Pro akan berusaha membuat tampilan kamera agar tetap stabil. Menarik, bukan? Anda bahkan bisa melakukan zoom optikal sebanyak 5 kali serta zoom digital hingga 60 kali.",
            "Sebuah fakta unik mengenai OPPO Reno4 adalah kehadiran dual camera pada bagian depan. Tapi yang jarang diketahui, bahwa kamera tambahan ini memiliki fungsi lain ketimbang untuk memotret.\n" +
                    "\n" +
                    "Ya, kamera kedua ini berfungsi untuk mendeteksi orang di sebelah Anda yang berusaha mengintip tampilan layar ponsel. Begitu terdeteksi, perangkat akan langsung menyembunyikan notifikasi yang ada, supaya privasi lebih aman.\n" +
                    "\n" +
                    "\n" +
                    "Selain itu, ada pula fitur Air Control yang berfungsi sebagai sarana navigasi yang menarik. Anda hanya perlu mengayunkan tangan untuk melakukan scroll pada medsos dan YouTube tanpa perlu menyentuhkan jari ke layar. Kini, beraktivitas di HP sambil ngemil jadi lebih nyaman.\n" +
                    "\n" +
                    "Menyoal sisi fotografi, OPPO Reno4 juga punya fitur unik yang bisa membuat Anda tampil beda di Instagram, yakni AI Color Portrait. Fitur ini akan membuat keseluruhan background menjadi hitam-putih, hanya objeknya saja yang berwarna. Tidak hanya saat berfoto, perekaman video pun bisa menggunakan fitur ini. Cocok untuk Anda yang suka vlogging.",
            "Redmi 9 sudah dihadirkan dengan harga yang terjangkau, tapi hampir mendekati Rp2-juta. Nah, kalau Anda ingin Redmi keluaran 2020 yang lebih murah lagi, ada Redmi 9A yang hanya dibanderol Rp1-juta lebih sedikit.\n" +
                    "\n" +
                    "Bisa dibilang, ini adalah ponsel Rp1-jutaan terbaik yang bisa didapatkan karena menghadirkan layar penuh 6,53 inci HD+ dengan desain poni serta kapasitas baterai sebesar 5.000 mAh. Ya, ketahanan baterai seperti ini merupakan penawaran terbaik untuk ponsel sejutaan.\n" +
                    "\n" +
                    "Perangkat pun hadir dengan Helio G20, sebuah chipset entry-level yang tergolong cukup layak untuk memainkan game ringan dan aktivitas harian. Selain itu, desain bodi belakangnya pun dibuat bertekstur supaya bekas sidik jari tidak mudah menempel.\n" +
                    "\n" +
                    "Di bagian penyimpanan, ada memori internal sebesar 32 GB yang ditemani RAM 2 GB yang memang cukup standar untuk HP di kelasnya. Kameranya hanya ada satu lensa 13 MP di belakang, namun sudah mencakup beragam fitur modern seperti AI Beautify, kaleidoskop, pendeteksian scene menggunakan AI, dan masih banyak lagi.\n" +
                    "\n" +
                    "Walau tidak menghadirkan sensor sidik jari untuk membuka kunci layar, kamera depan berkekuatan 5 MP miliknya memiliki kemampuan pendeteksian wajah atau Face Unlock.",
            "Kalau Xiaomi punya Redmi 9, maka Realme pun tidak mau kalah dengan menghadirkan HP terjangkau versi mereka. Ya, Realme C15 juga hadir di pasar Rp1-jutaan dengan spesifikasi yang siap menyaingi HP entry-level dari merk manapun.\n" +
                    "\n" +
                    "Berbekal baterai 6.000 mAh, Realme C15 lebih unggul ketimbang Redmi 9 dalam hal ini. Terlebih lagi, Realme C15 memiliki fitur Super Power Saving Mode yang bisa membuat ponsel bertahan selama 107 menit menggunakan WhatsApp meski sisa baterai tinggal 5 menit.\n" +
                    "\n" +
                    "Namun sayangnya, chipset yang dihadirkan hanyalah Helio G35 yang masih kalah jauh ketimbang Helio G80-nya Redmi 9. Nampaknya Realme C15 memang lebih memfokuskan pada daya tahan baterai ketimbang performa gaming.\n" +
                    "\n" +
                    "Perangkat pun sudah cukup unggul dengan menghadirkan varian RAM 3 GB dan RAM 4 GB dengan teknologi LPDDR4X, berikut dengan memori internal 64 GB dan 128 GB. Aktivitas multitasking dan menyimpan banyak aplikasi pun sudah tidak terkendala lagi dengan menggunakan Realme C15.",
            "Kalau kita bertanya pada muda-mudi yang hobi main PUBG Mobile ataupun Mobile Legends, HP impian mereka pasti tidak akan jauh-jauh dari ponsel gaming. Nah, yang lagi hot sekarang ini adalah ASUS ROG Phone 3. Ini adalah HP gaming pertama yang menghadirkan Snapdragon 865+ yang bisa meningkatkan kemampuan CPU hingga 3.1 GHz.\n" +
                    "\n" +
                    "Jadi kalau Anda mencari HP yang performa gaming-nya paling mantap sejagat raya di tahun 2020, ASUS ROG Phone 3 adalah jawabannya. Semua yang dihadirkan pada HP ini hanyalah yang terbaik, dengan RAM hingga 16 GB (LPDDR5) serta memori internal jumbo sebesar 512 GB (UFS 3.1).\n" +
                    "\n" +
                    "Soal layar, ASUS ROG Phone 3 tidak perlu diragukan lagi. ASUS mengerti bahwa untuk menghadirkan pengalaman gaming yang maksimal, layar harus menampilkan ketajaman dan kualitas tampilan yang terbaik. Untuk itulah terdapat sertifikasi HDR10+ dengan laju penyegaran 144 Hz, dijamin membuat pengalaman bermain jadi lebih asyik.",
            "Inovasi unik sudah pasti akan menyita banyak perhatian orang. Seperti Samsung Galaxy Z Fold2 contohnya, yang merupakan ponsel lipat besutan Samsung dengan kualitas layar terbaik serta performa yang hampir tak terkalahkan.\n" +
                    "\n" +
                    "HP yang merupakan generasi lanjutan dari Samsung Galaxy Fold ini menggunakan konsep yang sama – kemudahan pengguna dalam menenteng HP seukuran tablet di dalam kantong celana.\n" +
                    "\n" +
                    "Ponsel ini memiliki ukuran layar 7,6 inci saat dibuka, dan menghadirkan layar cover berukuran 6,3 inci saat dilipat. Layar dalamnya mengusung panel Dynamic AMOLED 2X dengan resolusi 1768 x 2208 piksel. Sementara itu, layar cover menghadirkan resolusi 816 x 2260 piksel dengan aspek rasio 25:9.\n" +
                    "\n" +
                    "Selain itu, Anda pun bisa merasakan pergerakan layar dua kali lipat lebih mulus dengan refresh rate 120 Hz. Menonton film ataupun beragam kegiatan lainnya tidak pernah terlihat semulus ini.",
            "Huawei tidak hanya menghadirkan flagship super canggih seperti Huawei P40 series, ada juga seri ponsel lainnya yang lebih murah seperti Huawei Nova 7. Berada di segmen harga mid-range, Huawei Nova 7 tergolong sebagai flagship killer dengan dapur pacu yang gahar di kelasnya. Hal ini karena Nova 7 dihadirkan dengan chipset Kirin 985 5G yang mampu meraih skor AnTuTu v8 sebesar 392.516 poin.\n" +
                    "\n" +
                    "Selain itu, tersemat juga layar panel OLED berukuran 6,53 inci dengan resolusi Full HD+. Mengusung warna DCI-P3, Anda pun bisa merasakan tampilan warna yang akurat saat bermain game maupun menonton film.\n" +
                    "\n" +
                    "Di sektor fotografi pun perangkat ini sudah siap diandalkan untuk menampilkan hasil foto berkualitas berkat sokongan quad camera di punggungnya. Serta, di bagian depan ada lensa selfie yang resolusinya cukup besar, yakni 32 MP.\n" +
                    "\n" +
                    "Huawei Nova 7 juga cocok dipakai binge-watching seharian tanpa tercolok kabel casan karena telah disematkan baterai 4.000 mAh dengan fast charging 4 W. Menariknya lagi, perangkat ini pun bisa dijadikan power bank untuk mengecas HP lain, menggunakan daya 5 W. Kekurangannya, tidak terdapat kualitas layar HDR10 ataupun laju penyegaran di atas 60 Hz."
    };

    private static String[] hpChipset = {
            "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
            "Exynos 990 (7 nm+)",
            "Mediatek Helio G80 (12 nm)",
            "Qualcomm SDM765 Snapdragon 765G (7 nm)",
            "Qualcomm SM7125 Snapdragon 720G (8 nm)",
            "MediaTek Helio G25 (12 nm)",
            "Helio G35 (12 nm)",
            "Qualcomm SM8250 Snapdragon 865+ (7 nm+)",
            "Qualcomm SM8250 Snapdragon 865+ (7 nm+)",
            "Kirin 985 5G (7 nm)"

    };

    private static String[] hpRam = {
            "6 GB, 8 GB",
            "8 GB",
            "3 GB, 4 GB",
            "8 GB",
            "8 GB",
            "2 GB",
            "3/4 GB",
            "8 GB, 12 GB, 16 GB",
            "12 GB RAM",
            "8 GB RAM"

    };

    private static String[] hpCamera = {
            "64 MP + 5 MP + 13 MP + 2 MP + 20 MP",
            "108 MP + 12 MP + 12 MP + 10 MP",
            "13 MP, 8 MP, 5 MP, 2 MP + 8 MP",
            "48 MP + 8 MP + 13 MP + 8 MP + 32 MP",
            "48 MP + 8 MP + 2 MP + 2 MP + 32 MP",
            "13 MP + 5 MP",
            "13 MP + 8 MP + 2 MP + 2 MP + 8 PM",
            "64 MP + 13 MP + 5 MP + 24 MP",
            "12 MP + 12 MP + 12 MP + 10 MP + 10 MP",
            "64 MP + 8 MP + 8 MP + 2 MP + 32 MP"

    };

    private static String[] hpBatre = {
            "Non-removable Li-Po 4700 mAh",
            "Non-removable Li-Ion 4,500 mAh",
            "Non-removable Li-Po 5020 mAh",
            "Non-removable Li-Po 4315 mAh",
            "Non-removable Li-Po 4015 mAh",
            "Non-removable Li-Po 5000 mAh",
            "Non-removable Li-Po 6000 mAh",
            "Non-removable Li-Po 6000 mAh",
            "Non-removable Li-Po 4500 mAh battery",
            "Non-removable Li-Po 4000 mAh"

    };

    private static String[] hpHarga = {
            "Rp. 6.999.000 (6 GB/128 GB)" +
                    "\n" + "Rp 7.999.000 (8 GB/256 GB)",
            "Rp. 17.999.000 (8 GB/256 GB)" +
                    "\n" +"Rp. 19.999.000 (8 GB/512 GB)",
            "Rp. 1.898.000 (4 GB/64 GB)",
            "Rp. 9.999.000 (8 GB/256 GB)",
            "Rp. 4.299.000 (8 GB/128 GB)",
            "Rp. 1.290.000 (2 GB/32 GB",
            "Rp. 1.500.000 (3 GB/64 GB)",
            "Rp. 10.000.000 (8 GB/128 GB) " +
                    "\n" + "Rp.15.000.000 (12 GB/256 GB)",
            "Rp. 29.300.000 (12 GB/256 GB)",
            "Rp. 6.899.000 (8 GB/256 GB)"
    };


    private static int[] hpImages ={
            R.drawable.pocof2,
            R.drawable.note20,
            R.drawable.redmi9,
            R.drawable.x50,
            R.drawable.reno4,
            R.drawable.redmi9a,
            R.drawable.c15,
            R.drawable.rog3,
            R.drawable.fold2,
            R.drawable.nova7
    };

    static ArrayList<Handphone> getListData() {
        ArrayList<Handphone> list = new ArrayList<>();
        for (int position = 0; position < hpNames.length; position++){
            Handphone handphone = new Handphone();
            handphone.setName(hpNames[position]);
            handphone.setDetail(hpDetails[position]);
            handphone.setPhoto(hpImages[position]);
            handphone.setChipset(hpChipset[position]);
            handphone.setMemori(hpRam[position]);
            handphone.setKamera(hpCamera[position]);
            handphone.setBatre(hpBatre[position]);
            handphone.setHarga(hpHarga[position]);
            list.add(handphone);
        }
        return list;
    }
}
