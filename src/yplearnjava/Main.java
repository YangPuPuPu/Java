// /*
//     * 排序方法。
//     * 请注意，所有公共“ sort”方法都采用相同的形式：
//     * 必要时执行参数检查，然后将参数扩展为其他package-private类中内部的实现方法所需的参数（legacyMergeSort除外）类）
//     */
//
//    /*
//     * 将指定的数组按升序排列。
//     * <p>实施说明：
//     * 排序算法是Vladimir Yaroslavskiy，Jon Bentley和Joshua Bloch编写的双枢轴快速排序。
//     * 该算法在许多数据集上提供O（n log（n））性能，从而导致其他快速排序降级为二次性能，并且通常比传统（单轴）Quicksort实现更快。
//     * @param a 一个要排序的数组
//     */
//    public static void sort(int[] a) {
//        DualPivotQuicksort.sort(a, 0, a.length - 1, null, 0, 0);
//    }
//
// /**
//     * 如果可能的话，使用给定的工作区数组切片对数组的指定范围进行排序
//     * @param a 要排序的数组
//     * @param left 要排序的第一个元素的索引（含）
//     * @param right 要排序的最后一个元素的索引（含）
//     * @param work 工作区数组（切片）
//     * @param work 工作阵列中可用空间的起源
//     * @param workLen 工作数组的可用大小
//     */
//    static void sort(int[] a, int left, int right,
//                     int[] work, int workBase, int workLen) {
//        // 在小型阵列上使用快速排序
//        // QUICKSORT_THRESHOLD:  如果要排序的数组的长度小于此常数，则快速排序优先于合并排序。(默认值: 286)
//        if (right - left < QUICKSORT_THRESHOLD) {
//            sort(a, left, right, true);
//            return;
//        }
//
//        /*
//         * 索引 run[i] 是第i次运行的开始（升序或降序）。
//         * MAX_RUN_COUNT: 合并排序中的最大运行次数(默认值: 67)
//         */
//        int[] run = new int[MAX_RUN_COUNT + 1];
//        int count = 0; run[0] = left;
//
//        // 检查数组是否接近排序
//        for (int k = left; k < right; run[count] = k) {
//            if (a[k] < a[k + 1]) { // 升序
//                while (++k <= right && a[k - 1] <= a[k]);
//            } else if (a[k] > a[k + 1]) { // 降序
//                while (++k <= right && a[k - 1] >= a[k]);
//                for (int lo = run[count] - 1, hi = k; ++lo < --hi; ) {
//                    int t = a[lo]; a[lo] = a[hi]; a[hi] = t;
//                }
//            } else { // 等于
//                // MAX_RUN_LENGTH: 合并排序中运行的最大长度(默认值: 33)
//                for (int m = MAX_RUN_LENGTH; ++k <= right && a[k - 1] == a[k]; ) {
//                    if (--m == 0) {
//                        sort(a, left, right, true);
//                        return;
//                    }
//                }
//            }
//
//            /*
//             * 数组不是高度结构化，请使用快速排序而不是合并排序。
//             */
//            if (++count == MAX_RUN_COUNT) {
//                sort(a, left, right, true);
//                return;
//            }
//        }
//// Check special cases
//        // Implementation note: variable "right" is increased by 1.
//        if (run[count] == right++) { // The last run contains one element
//            run[++count] = right;
//        } else if (count == 1) { // The array is already sorted
//            return;
//        }
// 
//        // Determine alternation base for merge
//        byte odd = 0;
//        for (int n = 1; (n <<= 1) < count; odd ^= 1);
// 
//        // Use or create temporary array b for merging
//        int[] b;                 // temp array; alternates with a
//        int ao, bo;              // array offsets from 'left'
//        int blen = right - left; // space needed for b
//        if (work == null || workLen < blen || workBase + blen > work.length) {
//            work = new int[blen];
//            workBase = 0;
//        }
//        if (odd == 0) {
//            System.arraycopy(a, left, work, workBase, blen);
//            b = a;
//            bo = 0;
//            a = work;
//            ao = workBase - left;
//        } else {
//            b = work;
//            ao = 0;
//            bo = workBase - left;
//        }
// 
//        // Merging
//        for (int last; count > 1; count = last) {
//            for (int k = (last = 0) + 2; k <= count; k += 2) {
//                int hi = run[k], mi = run[k - 1];
//                for (int i = run[k - 2], p = i, q = mi; i < hi; ++i) {
//                    if (q >= hi || p < mi && a[p + ao] <= a[q + ao]) {
//                        b[i + bo] = a[p++ + ao];
//                    } else {
//                        b[i + bo] = a[q++ + ao];
//                    }
//                }
//                run[++last] = hi;
//            }
//            if ((count & 1) != 0) {
//                for (int i = right, lo = run[count - 1]; --i >= lo;
//                    b[i + bo] = a[i + ao]
//                );
//                run[++last] = right;
//            }
//            int[] t = a; a = b; b = t;
//            int o = ao; ao = bo; bo = o;
//        }
//    }
//
//    }
//
// /**
//     * 通过Dual-Pivot Quicksort对指定范围的数组进行排序。
//     *
//     * @param a 要排序的数组
//     * @param left 要排序的第一个元素的索引（含）
//     * @param right 要排序的最后一个元素的索引（含）
//     * @param leftmost 指示此部分是否在范围的最左侧
//     */
//    private static void sort(int[] a, int left, int right, boolean leftmost) {
//        int length = right - left + 1;
//
//        // 在小型阵列上使用插入排序
//        // INSERTION_SORT_THRESHOLD: 如果要排序的数组的长度小于此常数，插入排序优先于快速排序使用。
//        if (length < INSERTION_SORT_THRESHOLD) {//46
//            // 为了方便查看,我把这部分单独拿了出来,可调到下面进行查看
//            return;
//        }
//
//        // 得到总长度的七分之一
//        int seventh = (length >> 3) + (length >> 6) + 1;
//
//        /*
//         * 在范围内的中心元素周围（包括周围）对五个等距元素进行排序。
//         * 这些元素将用于枢轴选择，如下所述。
//         * 根据经验确定这些元素的间距选择可以在各种输入上很好地工作。
//         */
//        int e3 = (left + right) >>> 1; // 中点, 4/7
//        int e2 = e3 - seventh; // 3/7
//        int e1 = e2 - seventh; // 2/7
//        int e4 = e3 + seventh; // 5/7
//        int e5 = e4 + seventh; // 6/7
//
//        // 使用插入排序对五个元素(枢轴)进行排序
//        //使之顺序为a[e1]<a[e2]<a[e3]<a[e4]<a[e5]
//        // 第二个点小于第一个点则交换
//        if (a[e2] < a[e1]) { int t = a[e2]; a[e2] = a[e1]; a[e1] = t; }
//		// 第三个点小于第二个点则交换
//        if (a[e3] < a[e2]) { int t = a[e3]; a[e3] = a[e2]; a[e2] = t;
//            // 3换到2之后再判断是否小于1,如果小于1则继续交换
//            if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//        }
//        // 同上
//        if (a[e4] < a[e3]) { int t = a[e4]; a[e4] = a[e3]; a[e3] = t;
//            if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
//                if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//            }
//        }
//        // 同上
//        if (a[e5] < a[e4]) { int t = a[e5]; a[e5] = a[e4]; a[e4] = t;
//            if (t < a[e3]) { a[e4] = a[e3]; a[e3] = t;
//                if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
//                    if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
//                }
//            }
//        }
//
//        // 指针
//        int less  = left;
//        int great = right;
//		// 判断五个元素是否都不一致
//        if (a[e1] != a[e2] && a[e2] != a[e3] && a[e3] != a[e4] && a[e4] != a[e5]) {
//            /*
//             * 使用五个排序元素中的第二个和第四个作为轴心。
//             * 这些值是阵列的第一和第二对的便宜的近似值。
//             * 请注意 pivot1 <= pivot2。
//             */
//            int pivot1 = a[e2];//确定两个轴的值
//            int pivot2 = a[e4];
//
//            /*
//             * 将要排序的第一个和最后一个元素移动到以前由枢轴占据的位置。
//             * 分区完成后，枢轴将交换回其最终位置，并从后续排序中排除。
//             */
//            a[e2] = a[left];
//            a[e4] = a[right];
//
//            /*
//             * 跳过元素, 小于或大于枢轴值。
//             */
//            while (a[++less] < pivot1);//当a[less]大于prvot1时，就停止
//            while (a[--great] > pivot2);//当a[great]小于prvot2时，就停止
//
//            /*
//             * 分区:
//             *
//             *   left part           center part                   right part
//             * +--------------------------------------------------------------+
//             * |  < pivot1  |  pivot1 <= && <= pivot2  |    ?    |  > pivot2  |
//             * +--------------------------------------------------------------+
//             *               ^                          ^       ^
//             *               |                          |       |
//             *              less                        k     great
//             *
//             * Invariants:
//             *
//             *              all in (left, less)   < pivot1
//             *    pivot1 <= all in [less, k)     <= pivot2
//             *              all in (great, right) > pivot2
//             *
//             * 指针 k 是 ?至part 的第一个索引.
//             */
//
//            /*
//             * Partitioning:
//             *
//             *   left part         center part                  right part
//             * +----------------------------------------------------------+
//             * | == pivot1 |  pivot1 < && < pivot2  |    ?    | == pivot2 |
//             * +----------------------------------------------------------+
//             *              ^                        ^       ^
//             *              |                        |       |
//             *             less                      k     great
//             *
//             * Invariants:
//             *
//             *              all in (*,  less) == pivot1
//             *     pivot1 < all in [less,  k)  < pivot2
//             *              all in (great, *) == pivot2
//             *
//             * Pointer k is the first index of ?-part.
//             */
//            outer:
//            for (int k = less - 1; ++k <= great; ) {//确定pivot1和pivot2的位置
//                int ak = a[k];//中间变量ak用来存储a[k]的值，便于交换
//                if (ak < pivot1) { // 移动 a[k] 到左边
//                    a[k] = a[less];
//                    a[less] = ak;
//                    ++less;
//                } else if (ak > pivot2) { // 移动 a[k] 到右边
//                    // 获取右边第一位小于pivot2的元素索引
//                    while (a[great] > pivot2) {//寻找一个小于piovt2的值
//                        if (great-- == k) { // 遍历完跳出循环(表示没有元素)
//                            break outer;
//                        }
//                    }
//                    if (a[great] < pivot1) { // a[great] <= pivot2，找到右边小于pivot1的值，交换到左边
//                        a[k] = a[less];
//                        a[less] = a[great];//小于pivot1就交换到a[less]
//                        ++less;
//                    } else { // pivot1 <= a[great] <= pivot2
//                        a[k] = a[great];//a[great]刚好就在p1和p2之间，可以直接赋值
//                    }
//                    /*
//                     *  因为ak大于pivot2交换到右边
//                     */
//                    a[great] = ak;
//                    --great;
//                }
//            }
//
//            // 交换枢轴到最终位置
//            a[left]  = a[less  - 1]; a[less  - 1] = pivot1;//less-1
//            a[right] = a[great + 1]; a[great + 1] = pivot2;//great+1
//
//            // 递归排序左右部分，不包括已知的轴
//            sort(a, left, less - 2, leftmost);
//            sort(a, great + 2, right, false);
//            /*
//             * 如果中心部分太大(大于等于数组的七分之四)，则将内部枢轴值(pivot1和pivot2)交换到末端。
//             */
//            if (less < e1 && e5 < great) {// 6/7-2/7
//                /*
//                 * 跳过等于枢轴值(pivot1和pivot2)的元素。
//                 */
//                while (a[less] == pivot1) {
//                    ++less;
//                }
//
//                while (a[great] == pivot2) {
//                    --great;
//                }
//                outer://将中间等于pivot1和pivot2的值移动到左右两端
//                for (int k = less - 1; ++k <= great; ) {//从less开始遍历到great
//                    int ak = a[k];//定义一个中间量存储a[k]的值
//                    if (ak == pivot1) { // ak等于pivot1时，交换a[less]和a[k]的值，并且less++
//                        a[k] = a[less];
//                        a[less] = ak;
//                        ++less;
//                    } else if (ak == pivot2) { //ak等于pivot2时
//                    	
//                        while (a[great] == pivot2) {//从右端开始遍历跳过等于pivot2的值
//                            if (great-- == k) {//遍历到k，没有元素的时候就跳出
//                                break outer;
//                            }
//                        }
//                        
//                        if (a[great] == pivot1) { // 判断a[great]是不是等于pivot1
//                            a[k] = a[less];
//                            /*
//                             * 如果a[great]等于pivot1
//                             * 就先交换a[k]和a[great]的值
//                             * 并且less++
//                             */
//                            a[less] = pivot1;
//                            ++less;
//                        } else { // pivot1 < a[great] < pivot2(不等于pivot1)
//                        	//就交换a[k]和a[great];
//                            a[k] = a[great];
//                        }
//                        a[great] = ak;//因为是ak=pivot2所以a[k]要交换到右端即下标为great
//                        --great;
//                    }
//                }
//            }
//            // 递归排序中心部分
//            sort(a, less, great, false);
//
//        } else { //当五个元素有任意两个或两个以上相等时
//             	 //用一个枢轴进行分区(分为小于p等于p和大于p)
//             	 //使用五个排序元素中的第三个作为枢轴。e3(4/7)
//            int pivot = a[e3];
//            for (int k = less; k <= great; ++k) {//k从less开始向great遍历
//                if (a[k] == pivot) {//如果相等就跳过
//                    continue;
//                }
//                int ak = a[k];
//                if (ak < pivot) { //如果ak比pivot小的话，就放入左端
//                    a[k] = a[less];
//                    a[less] = ak;
//                    ++less;
//                } else { // a[k] > pivot 如果ak大于pivot的话
//                    while (a[great] > pivot) {//great从右向左扫描直到扫描到一个小于等于枢轴p的值
//                        --great;
//                    }
//                    if (a[great] < pivot) { // a[great] <= pivot 若小于p的值
//                        a[k] = a[less];//将less的值给到a[k]
//                        a[less] = a[great];//将小于p的a[great]放到左端a[less];
//                        ++less;
//                    } else { // a[great] == pivot 等于的时候就交换a[great]和a[k];
//                        a[k] = pivot;
//                    }
//                    a[great] = ak;//因为ak大于p对应的值，所以要将ak放到右端，赋值给a[great]
//                    --great;
//                }
//            }
//             //递归排序左右部分。
//             //中心部分的所有元素均相等，因此已经排序。
//            sort(a, left, less - 1, leftmost);
//            sort(a, great + 1, right, false);
//        }
//    }
//
//    /*
//     * 分区退化为传统的3向（或“荷兰国旗”）架构
//     *
//     *   left part    center part              right part
//     * +-------------------------------------------------+
//     * |  < pivot  |   == pivot   |     ?    |  > pivot  |
//     * +-------------------------------------------------+
//     *              ^              ^        ^
//     *              |              |        |
//     *             less            k      great
//     *
//     * Invariants:
//     *
//     *   all in (left, less)   < pivot
//     *   all in [less, k)     == pivot
//     *   all in (great, right) > pivot
//     *
//     * Pointer k is the first index of ?-part.
//     */
//
//private static void sort(int[] a, int left, int right, boolean leftmost) {
//	if (leftmost) {
//        /*
//         * 传统（无前哨）插入类型，
//         * 针对服务器VM进行了优化,
//         * 用于最左边的部分.
//         */
//        for (int i = left, j = i; i < right; j = ++i) {
//            int ai = a[i + 1];	// 得到下一位元素的值
//            /*
//             * 判断ai是否小于前面的元素值
//             * 如果小于则将前面的值后移一位
//             * 一直往前遍历交换到首位或者前面元素值小于等于ai为止
//             */
//            while (ai < a[j]) {
//                a[j + 1] = a[j];
//                if (j-- == left) {
//                    break;
//                }
//            }
//            // 将最终索引出的值改为ai,完成交换
//            a[j + 1] = ai;
//        }
//    } else {
//        /*
//         * 跳过最长的升序.
//         */
//        do {
//            if (left >= right) {
//                return;
//            }
//        } while (a[++left] >= a[left - 1]);
//
//        /*
//         * 相邻部分的每个元素都扮演着哨兵的角色，
//         * 因此，这使我们避免了每次迭代的左范围检查。
//         * 此外，我们使用更优化的算法
//         * 所谓的配对插入排序
//         * （在Quicksort的背景下）这比传统的插入排序实现要快。
//         */
//        for (int k = left; ++left <= right; k = ++left) {
//            long a1 = a[k], a2 = a[left];
//
//            if (a1 < a2) {
//                a2 = a1; a1 = a[left];
//            }
//            while (a1 < a[--k]) {
//                a[k + 2] = a[k];
//            }
//            a[++k + 1] = a1;
//
//            while (a2 < a[--k]) {
//                a[k + 1] = a[k];
//            }
//            a[k + 1] = a2;
//        }
//        long last = a[right];
//
//        while (last < a[--right]) {
//            a[right + 1] = a[right];
//        }
//        a[right + 1] = last;
//    }
//}