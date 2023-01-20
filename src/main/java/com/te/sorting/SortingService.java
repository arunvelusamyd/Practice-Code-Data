package com.te.sorting;

import java.util.Arrays;

public class SortingService {

    public static void main(String args[]) {

        //Selection Sort
        int[] data = {8,3,6,7,1,2,5,4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.doSelectionSort(data);
        System.out.println("Selection Sort Result : ");
        for(int datum:data) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Insertion Sort
        int[] dataToSortByInsertionSort = {16,6,12,14,2,4,10,8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.doInsertionSort(dataToSortByInsertionSort);
        System.out.println("Insertion Sort Result : ");
        for(int datum:dataToSortByInsertionSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Bubble Sort
        int[] dataToSortByBubbleSort = {9,4,6,7,1,2,6,4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(dataToSortByBubbleSort);
        System.out.println("Bubble Sort Result : ");
        for(int datum:dataToSortByBubbleSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Quick Sort
        int[] dataToSortByQuickSort = {1,4,16,9,36,25,64,49};
        QuickSort quickSort = new QuickSort();
        quickSort.doQuickSort(dataToSortByQuickSort,0, 7);
        System.out.println("Quick Sort Result : ");
        for(int datum:dataToSortByQuickSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Merge Sort
        int[] dataToSortByMergeSort = {5,2,17,10,26,50,37,65};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(dataToSortByMergeSort);
        System.out.println("Merge Sort Result : ");
        for(int datum:dataToSortByMergeSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Heap Sort
        int[] dataToSortByHeapSort = {5,3,17,10,26,50,37,65};
        HeapSort heapSort = new HeapSort();
        heapSort.doHeapSort(dataToSortByHeapSort);
        System.out.println("Heap Sort Result : ");
        for(int datum:dataToSortByHeapSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Shell Sort
        int[] dataToSortByShellSort = {15,4,7,1,16,20,37,15,13};
        ShellSort shellSort = new ShellSort();
        shellSort.doShellSort(dataToSortByShellSort);
        System.out.println("Shell Sort Result : ");
        for(int datum:dataToSortByShellSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Counting Sort
        int[] dataToSortBycountingSort = {10,2,4,6,9,8,12};
        CountingSort countingSort = new CountingSort();
        int[] output = countingSort.doCountingSort(dataToSortBycountingSort);
        System.out.println("Counting Sort Result : ");
        Arrays.stream(output).forEach(val -> System.out.print(val+" "));
        System.out.println();

        //Radix Sort
        int[] dataToSortByRadixSort = {194, 25, 13, 18, 12, 58, 73, 39, 36, 143, 183, 121, 124};
        RadixSort radixSort = new RadixSort();
        int[] radixSortedoutput = radixSort.doRadixSort(dataToSortByRadixSort);
        System.out.println("Radix Sort Result : ");
        Arrays.stream(radixSortedoutput).forEach(val -> System.out.print(val+" "));
        System.out.println();

        //Bucket Sort
        int[] dataToSortByBucketSort = {21, 19, 43, 12, 18, 26, 29, 15, 33, 20,
                34, 57, 48, 39, 63, 51, 27, 55, 61, 53};
        //int[] dataToSortByBucketSort = {758287, 283347, 559065, 589095, 815505, 833824, 862662, 407824, 213592, 104064, 185049, 452345, 429386, 57297, 412950, 223629, 739476, 44421, 277246, 995086, 681489, 903336, 375072, 971146, 492649, 652851, 969992, 409155, 872820, 169500, 669444, 947298, 766711, 851965, 9637, 999910, 577608, 844194, 678840, 727688, 203081, 548775, 537115, 61240, 383615, 217023, 127370, 353112, 467260, 234385, 51345, 770147, 312888, 98805, 439091, 779988, 578495, 567141, 820728, 219333, 659192, 909887, 783761, 44519, 610368, 53377, 756058, 220120, 603190, 560787, 43736, 628895, 468749, 386022, 291719, 294733, 48395, 689759, 517003, 361688, 915883, 581728, 159067, 592062, 721413, 755332, 945458, 337686, 151987, 757251, 938344, 800176, 662799, 725945, 727933, 892303, 411544, 867094, 861996, 114521, 648479, 261767, 35345, 88106, 827935, 663250, 471906, 806224, 294661, 186374, 229218, 426571, 450162, 76433, 287484, 377705, 533497, 772577, 47729, 708430, 739259, 104342, 120813, 591876, 686078, 319342, 905304, 672900, 176809, 58926, 155617, 101723, 881985, 504683, 339488, 329356, 533860, 572915, 420356, 635873, 362753, 18404, 738649, 96152, 143664, 514115, 602557, 937125, 443372, 865950, 302101, 766271, 910770, 473212, 151756, 8050, 258968, 205400, 641896, 642513, 92557, 614483, 760788, 243978, 653099, 645605, 755540, 463206, 868095, 203912, 840646, 901188, 617398, 936519, 761608, 564103, 811756, 865051, 267155, 338747, 168192, 664622, 462948, 88333, 129308, 511359, 317664, 728340, 201742, 894047, 87799, 154528, 771283, 534115, 599958, 144730, 646368, 620047, 982735, 179126, 146497, 46069, 885493, 772327, 899717, 531316, 97292, 269240, 520002, 136206, 699047, 353556, 126029, 737285, 871415, 133954, 850114, 14232, 693819, 209478, 246658, 693599, 784032, 721437, 118304, 373366, 524601, 409352, 819674, 952075, 802416, 855962, 36529, 890080, 893590, 398756, 529468, 910254, 454943, 831327, 668384, 534856, 864789, 728515, 912490, 592297, 555427, 681144, 859259, 786751, 776688, 664912, 732129, 786828, 122784, 627385, 572190, 430949, 933959, 264914, 896277, 516504, 620151, 172530, 726338, 908462, 973331, 57991, 983437, 173931, 87310, 461698, 631847, 335380, 2054, 145471, 907488, 183863, 656259, 352351, 611984, 949008, 535730, 633769, 528105, 153223, 602981, 950759, 661682, 850540, 758650, 942352, 288715, 956700, 321305, 773246, 646748, 184229, 956603, 781122, 303340, 52583, 922742, 575887, 586377, 408550, 317143, 814147, 52418, 569585, 884255, 168906, 88121, 968666, 624552, 947523, 734780, 151160, 87497, 219648, 845442, 897032, 215443, 347343, 815655, 193430, 707839, 392097, 652680, 430980, 822299, 665595, 835738, 636548, 960868, 515726, 965644, 1584, 768351, 94063, 494937, 945634, 437851, 627877, 518927, 662123, 327280, 387943, 405399, 784917, 80117, 199541, 667703, 204311, 132377, 502940, 285128, 180232, 74381, 305955, 134451, 725963, 505811, 383788, 3296, 673741, 244816, 819687, 971196, 156201, 480088, 935172, 336973, 391701, 698969, 308121, 860125, 643252, 664727, 15600, 745830, 407573, 458421, 547168, 800509, 651121, 786119, 292433, 285209, 538115, 223756, 113081, 7033, 237801, 545184, 981493, 666399, 26197, 779550, 417488, 752256, 218762, 912896, 71247, 999954, 78424, 995230, 269971, 862156, 385345, 892168, 988941, 497930, 680852, 653034, 705209, 761002, 239254, 977235, 690918, 721930, 595593, 789759, 113144, 252385, 1259, 726973, 414955, 758532, 686981, 826796, 297258, 602589, 118684, 480788, 384744, 549951, 618491, 65259, 786585, 593576, 328319, 455166, 820052, 243737, 983105, 567958, 485430, 651796, 754388, 181928, 235764, 952606, 503052, 778979, 19107, 512710, 538267, 116691, 986686, 136847, 224548, 724350, 943831, 449322, 185631, 18289, 331196, 807700, 313676, 301733, 898552, 210640, 456000, 190956, 319753, 207172, 869147, 509412, 121922, 139821, 813661, 96746, 694158, 186639, 147450, 707606, 938866, 650915, 852328, 115317, 684519, 733496, 2547, 132528, 991904, 904980, 620106, 126909, 482298};
        BucketSort bucketSort = new BucketSort();
        int[] bucketSortedArr = bucketSort.doBucketSort(dataToSortByBucketSort);
        System.out.println("Bucket Sort Result : ");
        Arrays.stream(bucketSortedArr).forEach(val -> System.out.print(val+" "));
        System.out.println();

    }
}