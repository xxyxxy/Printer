package com.ysq.printer;

import android.content.Context;
import android.content.Intent;

/**
 * <pre>
 * author : 杨水强
 * time   : 2018/05/31
 * desc   :
 * version: 1.0
 * </pre>
 */
public class SunmiscPrinter implements Printable {

    private Context mContext;

    public SunmiscPrinter(Context context) {
        mContext = context;
    }

    @Override
    public void init() {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 0);
        mContext.startService(intent);
    }

    @Override
    public void printText(String text, boolean isCenter, boolean isLarge) {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 3);
        intent.putExtra(SunmiscPrinterService.EXTRA_TEXT, text);
        intent.putExtra(SunmiscPrinterService.EXTRA_CENTER, isCenter);
        intent.putExtra(SunmiscPrinterService.EXTRA_LARGE, isLarge);
        mContext.startService(intent);
    }


    @Override
    public void printBarcode(String text) {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 4);
        intent.putExtra(SunmiscPrinterService.EXTRA_TEXT, text);
        mContext.startService(intent);
    }

    @Override
    public void printQrcode(String text) {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 5);
        intent.putExtra(SunmiscPrinterService.EXTRA_TEXT, text);
        mContext.startService(intent);
    }

    @Override
    public void flushPrint() {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 1);
        mContext.startService(intent);
    }

    @Override
    public void delay(int millisecond) {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 6);
        intent.putExtra(SunmiscPrinterService.EXTRA_DELAY, millisecond);
        mContext.startService(intent);
    }

    @Override
    public void feedPaper() {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 7);
        mContext.startService(intent);
    }

    @Override
    public void close() {
        Intent intent = new Intent(mContext, SunmiscPrinterService.class);
        intent.putExtra(SunmiscPrinterService.EXTRA_TYPE, 2);
        mContext.startService(intent);
    }
}
