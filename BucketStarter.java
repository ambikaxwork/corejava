package com.xworkz.dp;

import com.xworkz.dp.dao.BucketDAO;
import com.xworkz.dp.dto.BucketDTO;
//test
public class BucketStarter {

	public static void main(String[] args) {
		BucketDTO bucketDTO1 = new BucketDTO("pink", "renhas", 5.7f, 150f, 3, 2.6f);
		BucketDTO bucketDTO2 = new BucketDTO("red", "venus", 5.7f, 200f, 3, 2.6f);
		BucketDTO bucketDTO3 = new BucketDTO("blue", "venus", 5.7f, 150f, 3, 2.6f);
		BucketDTO bucketDTO4 = new BucketDTO("green", "ven", 5.7f, 150f, 3, 2.6f);
		BucketDTO bucketDTO5 = new BucketDTO("black", "vegas", 5.7f, 150f, 3, 2.6f);

		BucketDAO bucketDAO = new BucketDAO();
		bucketDAO.save(bucketDTO5);
		bucketDAO.delete(1);
		bucketDAO.update(bucketDTO3, 3);
		bucketDAO.display();

	}

}
