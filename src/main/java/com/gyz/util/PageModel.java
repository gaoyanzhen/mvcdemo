package com.gyz.util;

import java.util.List;

public final class PageModel<T> {
	private int currentPage;// ��ǰҳ
	private int pageSize;// ÿҳ��ʾ����
	private int totalPage;// ��ҳ��
	private int totalRecord;// �ܼ�¼��
	private List<T> dataList;// ��ҳ����

	private PageModel() {
	}

	/*
	 * ��ʼ��PageModelʵ��
	 */
	private PageModel(final int pageSize, final String page,
			final int totalRecord) {
		// ��ʼ��ÿҳ��ʾ����
		this.pageSize = pageSize;
		// �����ܼ�¼��
		this.totalRecord = totalRecord;
		// ��ʼ����ҳ��
		setTotalPage();
		// ��ʼ����ǰҳ
		setCurrentPage(page);

	}

	/*
	 * �����PageModelʵ��
	 */
	public static PageModel newPageModel(final int pageSize, final String page,
			final int totalRecord) {

		return new PageModel(pageSize, page, totalRecord);
	}

	// ���õ�ǰ����ҳ
	private void setCurrentPage(String page) {
		try {
			currentPage = Integer.parseInt(page);

		} catch (java.lang.NumberFormatException e) {
			// �����쳣����������ǰҳĬ��Ϊ1
			currentPage = 1;
		}
		// �����ǰҳС�ڵ�һҳʱ����ǰҳָ������ҳ
		if (currentPage < 1) {

			currentPage = 1;
		}

		if (currentPage > totalPage) {

			currentPage = totalPage;

		}

	}

	private void setTotalPage() {
		if (totalRecord % pageSize == 0) {

			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	/*
	 * ��õ�ǰҳ
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/*
	 * �����ҳ��
	 */
	public int getTotalPage() {
		return totalPage;

	}

	/*
	 * ��ÿ�ʼ����
	 */
	public int getStartRow() {
		return (currentPage - 1) * pageSize;
	}

	/*
	 * ��ý�����
	 */
	public int getEndRow() {
		return currentPage * pageSize;
	}

	/*
	 * ��÷�ҳ����
	 */
	public List<T> getDataList() {
		return dataList;
	}

	/*
	 * ���÷�ҳ����
	 */
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	// ��ҳ
	public int getFirst() {

		return 1;
	}

	//
	// ��һҳ

	public int getPrevious() {

		return currentPage - 1;
	}

	//
	// // ��һҳ
	public int getNext() {

		return currentPage + 1;
	}

	//
	// // βҳ
	//
	public int getLast() {

		return totalPage;
	}
}
